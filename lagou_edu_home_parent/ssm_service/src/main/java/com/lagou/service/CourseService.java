package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.CourseVo;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface CourseService {
    /*
    多条件课程列表查询
     */
    List<Course> findCourseByCoundition(CourseVo courseVo);

    /*
    保存课程信息
     */
    void saveCourseOrTeacher(CourseVo courseVO);
    /**
     * 根据id获取课程信息
     * */
    CourseVo findCourseById(int id);

    /**
     * 修改课程信息
     * */
    void updateCourseOrTeacher(CourseVo courseVO);

    /**
     * 修改课程状态
     * */
    void updateCourseStatus(int id,int status);





}
