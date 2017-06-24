package org.learnjava.dq.biz.manager;

import org.learnjava.dq.biz.domain.UserInfo;

import java.util.List;

/**
 * 作用:
 * User: duqi
 * Date: 2017/6/22
 * Time: 22:39
 */
public interface UserInfoManager {

    Boolean saveUserInfo(UserInfo userInfo);

    Boolean updateUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByUserId(Long userId);

    UserInfo getUserInfoByMobile(String mobile);

    List<UserInfo> listUserInfoByUserIds(List<Long> userIds);

    Boolean removeUserInfoByUserId(Long userId);
}
