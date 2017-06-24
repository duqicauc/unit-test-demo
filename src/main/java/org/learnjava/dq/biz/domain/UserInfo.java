package org.learnjava.dq.biz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作用:
 * User: duqi
 * Date: 2017/6/22
 * Time: 22:40
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Long userId;
    private String name;
    private String mobile;
    private Integer sex;
}
