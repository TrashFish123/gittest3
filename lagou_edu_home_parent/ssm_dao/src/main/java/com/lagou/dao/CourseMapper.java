package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.CourseVo;
import com.lagou.domain.Teacher;


import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface CourseMapper {
    /*
    多条件课程列表查询
     */
    List<Course> findCourseByConditioin(CourseVo courseVo);
    /**
     * 保存课程信息
     */
    int saveCourse(Course course);
    /**
     * 保存讲师信息
     * */
    void saveTeacher(Teacher teacher);
    /**
     * 根据id 获取课程信息
     * */
     CourseVo findCourseById(int id);

    /**
     * 修改课程信息
     * */
     void updateCourse(Course course);
    /**
     * 修改讲师信息
     * */
     void updateTeacher(Teacher teacher);
    /**
     * 修改课程状态
     * */
    void updateCourseStatus(Course course);




}
