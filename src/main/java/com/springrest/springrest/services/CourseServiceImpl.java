package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;
    // List<Course> list;

    public CourseServiceImpl() {
        // list = new ArrayList<>();
        // list.add(new Course(145, "Java Core Course", "Covers basics of Java"));
        // list.add(new Course(146,"Kotlin Basics", "This course covers the basic of kotlin"));
    }

    @Override
    public List<Course> getCourses() {

        // return list;
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        
        // Course c = null;

        // for(Course curr: list) {

        //     if(curr.getId() == courseId) {
        //         c = curr;
        //         break;
        //     }
        // }

        // return c;

        return courseDao.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        
        // list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        
        // Course c = null;

        // for(Course curr : list) {

        //     if(curr.getId() == course.getId()) {
        //         curr.setDescription(course.getDescription());
        //         curr.setTitle(course.getTitle());
        //         c= curr;
        //         break;
        //     }
        // }
        courseDao.save(course);
        return course;
    }
    
    @Override
    public void deleteCourse(long courseId) {
        
        // for(Course curr: list) {
            
        //     if(curr.getId() == courseId) {
        //         list.remove(curr);
        //     }
        // }
        
        courseDao.delete(courseDao.getReferenceById(courseId));
    }
    
}
