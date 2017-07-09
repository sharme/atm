package com.crawler.dao;

import com.crawler.util.LoggerUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Repository(value="util")
public class DBUtil {

	private Logger log = Logger.getLogger(DBUtil.class);
	

    @Autowired
    private JdbcTemplate simpleJdbcTemplate;


	@Resource(name="simpleJdbcTemplate")
	public void setSimpleJdbcTemplate(JdbcTemplate simpleJdbcTemplate) {
		this.simpleJdbcTemplate = simpleJdbcTemplate;
	}

	/**
	 * 添加或者更新数据
	 * @param sql
	 * @return
	 */
	public Integer addOrUpdate(String sql){
		Integer id = 0;
		try {
			id = simpleJdbcTemplate.update(sql);

		} catch (Exception e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return id;
	}
	
	/**
	 * 获取List集合
	 * @param sql
	 * @param className
	 * @param obj
	 * @return
	 */
	public List<?> getObjList(String sql, final Class<? extends Serializable> className, Object[] obj){
		
		List<?> array = null;
		try {
			if(obj!=null&&obj.length>0){
                array = simpleJdbcTemplate.query(sql, this.parseResut(className));
//                array =  simpleJdbcTemplate.queryForList(sql, ParameterizedBeanPropertyRowMapper.newInstance(className),obj);
			}else{
//				array =  simpleJdbcTemplate.queryForList(sql, className);
                array = simpleJdbcTemplate.query(sql, this.parseResut(className));
			}

		}catch (EmptyResultDataAccessException e) {
			log.info("查询数据结果为空-:"+e+"-sql:"+sql);
			
		} catch (Exception e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return array;
	}

	public RowMapper parseResut(final Class<? extends Serializable> className){
        return new RowMapper<Object>() {

            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {

                try {
                    Class cls = Class.forName(className.getName());
                    Object cc = cls.newInstance();
                    Method method = cls.getMethod("mapRow",ResultSet.class,int.class);
                    return method.invoke(cc,resultSet,i);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }

	public static Object mapRow(ResultSet resultSet, int i,final Class<? extends Serializable> className){

        Class cls = null;

        try {
            Object cc = cls.newInstance();
            cls = Class.forName(className.getName());
            Class set = Class.forName(resultSet.getClass().getName());
            Field[] field = cls.getDeclaredFields();
            StringBuilder stringName = new StringBuilder();
            for(Field ff:field){

                String name = ff.getName();
                if(!name.equalsIgnoreCase("serialVersionUID")){

                    String type = ff.getType().toString();// 得到此属性的类型
                    String setMethod = "get"+type.substring(0,1).toUpperCase()+type.substring(1);
                    Method method = set.getMethod(setMethod,String.class);
                    method.invoke(resultSet,name);

                    String pMethod = "set"+name.substring(0,1).toUpperCase()+name.substring(1);
//                    Method pMethod = set.getMethod(setMethod,String.class);
                }
                stringName.append(ff.getName()+"-");

            }
            LoggerUtil.info(DBUtil.class,"pro:"+stringName);
            Method[] methods = cls.getMethods();
            StringBuilder stringMethod = new StringBuilder();
            for(Method mt:methods){

                stringMethod.append(mt.getName()+"-");

            }
            LoggerUtil.info(DBUtil.class,"method:"+stringMethod);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
	
	/**
	 * 获取Map集合值
	 * @param sql
	 * @param obj
	 * @return
	 */
	public Map<String,?> getMap(String sql,Object[] obj){
		
		Map<String, ?> map = null;
		try {
			if(obj==null||obj.length==0){
				map = simpleJdbcTemplate.queryForMap(sql);
			}else{
				map = simpleJdbcTemplate.queryForMap(sql, obj);
			}
		} catch (Exception e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		
		return map;
	}
	
	/**
	 * 获取相应的Object
	 * @param sql
	 * @param className
	 * @param obj
	 * @return
	 */
	public Object getObject(String sql,Class<? extends Serializable> className,Object[] obj){
		
		Object object = null;
		try {
			
			if(obj==null||obj.length==0){
		
				object = simpleJdbcTemplate.queryForObject(sql, this.parseResut(className));
			}else{
				object = simpleJdbcTemplate.queryForObject(sql, this.parseResut(className), obj);
			}
		}catch (EmptyResultDataAccessException e) {
			log.info("查询数据结果为空-:"+e+"-sql:"+sql);
			
		}catch (DataAccessException e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return object;
	}
	
	/**
	 * 批量操作
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int[] batchOperate(String sql,List<?> obj){
		
		int[] a = null;
		try {
			a = simpleJdbcTemplate.batchUpdate(sql, (List<Object[]>) obj);
		} catch (Exception e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return a;
	}
	
	/**
	 * 检查是否有值
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int isExist(String sql,Object[] obj){
		int index = 0;
		try {
			if(obj==null){

				index = simpleJdbcTemplate.queryForList(sql).size();
			}else{
				index = simpleJdbcTemplate.queryForList(sql,obj).size();
			}
		} catch (Exception e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return index;
	}
	
	/**
	 * 编辑操作(增删改查都可以)
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int editObject(String sql,Object[] obj){
		int index = 0;
		try {
			index = simpleJdbcTemplate.update(sql, obj);
		}catch (EmptyResultDataAccessException e) {
			log.info("查询数据结果为空-:"+e+"-sql:"+sql);
			
		} catch (DataAccessException e) {
			log.info(e);
			throw new DaoException("数据库操作失败！",e);
		}
		return index;
	}
	
	/**
	 * @param simpleJdbcTemplate the simpleJdbcTemplate to set
	 */
//	@Resource(name="dataSource")
//	public void setSimpleJdbcTemplate(DataSource dataSource) {
//		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
//	}
}