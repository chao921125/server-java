package com.cc.common.utils;

import com.cc.common.core.PageEntity;
import com.cc.common.core.PageSupport;
import com.cc.common.utils.SqlUtil;
import com.github.pagehelper.PageHelper;

public class PageUtil extends PageHelper {
    public static void startPage() {
        PageEntity pageEntity = PageSupport.buildPageRequest();
        Integer pageNumber = pageEntity.getPageNumber();
        Integer pageSize = pageEntity.getPageSize();
        String orderBy = SqlUtil.escapeOrderBySql(pageEntity.getOrderBy());
        Boolean reasonable = pageEntity.getReasonable();
        PageHelper.startPage(pageNumber, pageSize, orderBy).setReasonable(reasonable);
    }

    public static void cleanPage() {
        PageHelper.clearPage();
    }
}