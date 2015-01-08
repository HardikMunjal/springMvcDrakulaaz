package com.draka.service.drakulaaz;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.draka.dao.drakulaaz.DuserDao;
import com.draka.domain.drakulaaz.Duser;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DuserServiceImpl implements DuserService {


@Autowired
DuserDao duserDao;
@Override
public void addDuser(Duser duser) {
duserDao.saveDuser(duser);
}


@Override
public List<Duser> getDuser() {
return duserDao.getDuser();
}



}
