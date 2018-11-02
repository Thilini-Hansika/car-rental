package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;

/**
 * Created by Ze on 10/31/2018.
 */
public interface AdminService {
    public Boolean addNewAdmin(AdminDto admin);
    public AdminDto getAdminDetail(String password);
    public AdminDto updateAdminDetail(AdminDto adminDto);


}
