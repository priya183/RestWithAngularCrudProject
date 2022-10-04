package com.yash.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.StudentForm;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public void SaveData(StudentForm sf) {
	// TODO Auto-generated method stub
	hr.save(sf);	
	}

	@Override
	public List<StudentForm> GetAllStudentForm() {
	// TODO Auto-generated method stub
	return hr.findAll();
	}
	
	@Override
	public void deleteData(int sid) {
		// TODO Auto-generated method stub
		hr.deleteById(sid);
	}

	@Override
	public StudentForm updateData(StudentForm sf) {
		{
			StudentForm s1 = new StudentForm();
	        try {
	            s1 = hr.save(sf);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	            
	        }

     return s1;
		
	}
}	
	@Override
    public StudentForm getStudentById(int id) {
        
        return hr.findById(id).get();
    }

   @Override
    public void UpdateData(StudentForm sf) {
        StudentForm s=new StudentForm();
        System.out.println(sf.getSid());
        s=hr.findById(sf.getSid()).get();
        
        s.setSname(sf.getSname());
        s.setAddress(sf.getAddress());
        s.setEmail(sf.getEmail());
        s.setMobno(sf.getMobno());
        
        hr.save(s);
        
    }

}
