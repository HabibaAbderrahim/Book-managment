package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Admin;
import com.ha.tn.ktebi.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdminService {
    public ResponseEntity saveAdmin(Admin admin) ;
    public ResponseEntity updateAdmin (User user);
    public ResponseEntity deleteAdmin (Integer adminId);
    public ResponseEntity<List<Admin>>  getAllAdmins ();
    public ResponseEntity<Admin> getAdminByID (Integer adminId);

}
