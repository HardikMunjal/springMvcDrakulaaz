package com.draka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.draka.dao.ClientRoleDao;
import com.draka.domain.ClientRole;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ClientRoleServiceImpl implements ClientRoleService {


@Autowired
ClientRoleDao ClientRoleDao;
@Override
public void saveClientRole(ClientRole ClientRole) {
ClientRoleDao.saveClientRole(ClientRole);
}



}
