package com.restapijpa.restapidatajpa.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapijpa.restapidatajpa.dao.CourseDao;
import com.restapijpa.restapidatajpa.entities.Course;
//implements CourseService 
@Service
public class CourseServiceImpl implements CourseService  {
	
	@Autowired
	private CourseDao courseDao;
	@Override
	public List<Course> getCourses() {
		//it will return list of courses
		//it will take data from db and add into list and return it
		return courseDao.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course ;
	}

	@Override
	public Course updateCourse(Course course) {
		//if course is available it will update otherwise it will create new one
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
