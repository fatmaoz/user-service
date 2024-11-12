package com.oz.service.impl;

import com.oz.dto.RoleDTO;
import com.oz.entity.Role;
import com.oz.exception.RoleNotFoundException;
import com.oz.repository.RoleRepository;
import com.oz.service.RoleService;
import com.oz.util.MapperUtil;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {


    private final RoleRepository roleRepository;
    private final MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public RoleDTO readByDescription(String description) {
        Role role = roleRepository.findByDescription(description)
                .orElseThrow(() -> new RoleNotFoundException("Role does not exist."));
        return mapperUtil.convert(role, new RoleDTO());
    }

}
