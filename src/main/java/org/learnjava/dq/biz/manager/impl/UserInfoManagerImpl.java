package org.learnjava.dq.biz.manager.impl;

import org.learnjava.dq.biz.domain.UserInfo;
import org.learnjava.dq.biz.manager.UserInfoManager;
import org.learnjava.dq.core.dal.bean.UserInfoBean;
import org.learnjava.dq.core.dal.dao.UserInfoDAO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 * 作用:
 * User: duqi
 * Date: 2017/6/22
 * Time: 22:39
 */
@Component
@Slf4j
public class UserInfoManagerImpl implements UserInfoManager {

    @Resource
    private UserInfoDAO userInfoDAO;

    @Override
    public Boolean saveUserInfo(UserInfo userInfo) {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setUserId(userInfo.getUserId());
        userInfoBean.setMobile(userInfo.getMobile());
        userInfoBean.setNickname(userInfo.getNickname());
        userInfoBean.setSex(userInfo.getSex());
        userInfoBean.setUpdateTime(new Date());
        userInfoBean.setCreateTime(new Date());

        int rows =userInfoDAO.saveUserInfoBean(userInfoBean);
        if (rows != 1) {
            log.error("save userInfo to db failed. userInfoBean:{}, rows:{}", userInfoBean, rows);
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByMobile(String mobile) {
        return null;
    }

    @Override
    public List<UserInfo> listUserInfoByUserIds(List<Long> userIds) {
        return null;
    }

    @Override
    public Boolean removeUserInfoByUserId(Long userId) {
        return null;
    }
}
