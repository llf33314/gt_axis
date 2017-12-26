package com.gt.axis.bean.wxmp.material;

import java.util.List;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class MateralWrapRes {

    private MateralRes parentMateral;//主图文

    private List<MateralRes> children;//子图文，主图文为多图文时会有返回

    public MateralRes getParentMateral() {
        return parentMateral;
    }

    public void setParentMateral(MateralRes parentMateral) {
        this.parentMateral = parentMateral;
    }

    public List<MateralRes> getChildren() {
        return children;
    }

    public void setChildren(List<MateralRes> children) {
        this.children = children;
    }
}
