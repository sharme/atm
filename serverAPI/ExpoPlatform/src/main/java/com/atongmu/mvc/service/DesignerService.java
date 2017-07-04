package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.model.Exhibitor;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
public interface DesignerService {

    public List<Designer> getDesigners(int start, int count, String type, String city);

    public int getDesignerNumber();

    public Designer getDesignerById(int id);

    public Designer getDesignerByUId(int u_id);

}
