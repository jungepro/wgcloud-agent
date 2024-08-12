package com.wgcloud.util;


import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


public class PageUtil {

    public static void initPageNumber(PageInfo pageInfo, Model model) {
        List<String> pageNumbers = new ArrayList<String>();
        for (int i = 5; i > 0; i--) {
            if (pageInfo.getPageNum() - i > 0) {
                pageNumbers.add((pageInfo.getPageNum() - i) + "");
            }
        }
        for (int i = 0; i < 5; i++) {
            if (pageInfo.getPageNum() + i <= pageInfo.getPages()) {
                pageNumbers.add((pageInfo.getPageNum() + i) + "");
            }
        }
        model.addAttribute("pageNumbers", pageNumbers);
    }

}
