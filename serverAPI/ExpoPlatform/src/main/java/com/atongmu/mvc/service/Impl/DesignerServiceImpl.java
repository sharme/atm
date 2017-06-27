package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.DesignerMapper;
import com.atongmu.mvc.dao.ExhibitorMapper;
import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.model.Exhibitor;
import com.atongmu.mvc.service.DesignerService;
import com.atongmu.mvc.service.ExhibitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Service("designerServiceImpl")
public class DesignerServiceImpl implements DesignerService {

    @Autowired
    DesignerMapper designerMapper;

    @Override
    public List<Designer> getDesigners(int count, String type, String city) {
        return designerMapper.getDesigners(count, type, city);
    }

    @Override
    public Designer getDesignerById(int id) {
        return designerMapper.getDesignerById(id);
    }
}
