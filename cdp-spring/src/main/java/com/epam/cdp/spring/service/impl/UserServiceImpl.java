package com.epam.cdp.spring.service.impl;

import com.epam.cdp.hibernate.model.User;
import com.epam.cdp.hibernate.repository.IUserRepository;
import com.epam.cdp.spring.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by Ilya_Kukushkin on 12/16/2014
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long, IUserRepository> implements IUserService {

    @Override
    public List<User> findAllUsersWithoutSkills() {
        return repository.findAllUsersWithoutSkills();
    }

    @Override
    public List<User> findByProjectId(Long projectId) {
        return repository.findByProjectId(projectId);
    }

    @Override
    public List<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<User> findByIds(Collection<Long> userIds) {
        return repository.findByIds(userIds);
    }
}
