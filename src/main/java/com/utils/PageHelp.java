package com.utils;

import java.util.List;

/**
 * Created by admin on 2016/4/19.
 */
public class PageHelp<T> {

    //当前页
    private int pageIndex;
    //每页显示条数
    private int pageCount = 1;
    //数据条数
    private int count = 1;
    //一共多少页
    private int pageSize;
    //起始位置
    private int start;
    //结束位置
    private int end;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    private List<T> list = null;

    public void init (){
        int pageSize_x = (int) count/pageCount;
        if (count>pageCount){
            this.pageSize=count%pageCount==0?pageSize_x:pageSize_x+1;
        }else {
            this.pageSize = 1;
        }
        //判断当前页面
        if (pageSize > pageIndex){
            pageIndex = 1;
        }else {
            pageIndex = pageSize ;
        }
        //根据当前页计算起始和结束条目
        this.start=(pageIndex-1)*pageCount;
        this.end=pageIndex*pageCount;
    }


    public PageHelp(){
        super();
    }

    public PageHelp(int pageIndex,int count,int pageCount){
        super();
        this.pageIndex = pageIndex;
        this.count = count;
        this.pageCount = pageCount;
    }

    public PageHelp(int pageIndex,int count,int pageCount,List<T> list){
        super();
        this.pageIndex = pageIndex;
        this.count = count;
        this.pageCount = pageCount;
        this.list = list;
    }




    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
