package com.crawler.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * BaseDao的interface
 */
interface BaseDao {

	/**
	 * 保存或者更新实体
	 * @param sql
	 *
	 */
	<T extends Serializable> Integer saveOrUpdateObject(String sql);

	/**
	 * 查询实体列表
	 * @param sql
	 * @param className
	 * @param objs
	 * @return
	 */
	<T extends Serializable> List<T> getObjList(String sql, Class<T> className, Object[] objs);

	/**
	 * 查询实体
	 * @param <T>
	 * @param sql
	 * @param objs
	 * @return
	 */
	<T extends Serializable> T getObject(String sql, Class<T> clazz, Object[] objs);

	/**
	 * 查询一个Map集合
	 * @param sql
	 * @param objs
	 * @return
	 */
	Map<String,?> find(String sql, Object[] objs);

	/**
	 * 批量操作
	 * @param sql
	 * @param objLs
	 */
	void batchOperate(String sql, List<?> objLs);

	/**
	 * 判断实体是否存在
	 * @param sql
	 * @param obj
	 * @return
	 */
	int isExist(String sql, Object[] obj);

	/**
	 * 编辑操作
	 * @param sql
	 * @param obj
	 * @return
	 */
	int editObject(String sql, Object[] obj);

}

@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {
	
	@Autowired
	private DBUtil util;

	@Override
	public void batchOperate(String sql, List<?> objs) {
		util.batchOperate(sql, objs);
	}

	@Override
	public int editObject(String sql, Object[] obj) {
		return util.editObject(sql, obj);
	}

	@Override
	public Map<String, ?> find(String sql, Object[] objs) {
		return util.getMap(sql, objs);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Serializable> List<T> getObjList(String sql,
			Class<T> className, Object[] objs) {
		return (List<T>)util.getObjList(sql, className, objs);
	}

	@Override
	public int isExist(String sql, Object[] obj) {
		return util.isExist(sql, obj);
	}

	@Override
	public <T extends Serializable> Integer saveOrUpdateObject(String sql) {

		return util.addOrUpdate(sql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Serializable> T getObject(String sql,Class<T> clazz,Object[] objs) {
		return (T)util.getObject(sql, clazz, objs);
	}

}
