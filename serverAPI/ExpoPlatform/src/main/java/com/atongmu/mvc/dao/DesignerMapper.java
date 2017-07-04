package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.model.Exhibitor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Repository
public interface DesignerMapper {

    public List<Designer> getDesigners(@Param(value = "start") int start, @Param(value = "count") int count, @Param(value = "type") String type, @Param(value = "city") String city);

    public int getDesignerNumber();

    public Designer getDesignerById(int id);

    public Designer getDesignerByUId(int u_id);


}
