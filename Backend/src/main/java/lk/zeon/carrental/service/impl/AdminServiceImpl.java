package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;
import lk.zeon.carrental.repository.AdminRepository;
import lk.zeon.carrental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ze on 10/31/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean addNewAdmin(AdminDto admin) {
        Admin admin1=new Admin();
        admin1.setAdminId(admin.getAdminId());
        admin1.setFullName(admin.getFullName());
        admin1.setUserName(admin.getUserName());
        admin1.setPassword(admin.getPassword());
        admin1.setAddress(admin.getAddress());
        admin1.setMobile(admin.getMobile()
        );
        adminRepository.save(admin1);
        return true;
    }

    @Override
    public AdminDto getAdminDetail(String password) {
        return null;
    }

    @Override
    public AdminDto updateAdminDetail(AdminDto adminDto) {
        return null;
    }
}
