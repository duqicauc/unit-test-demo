-- ----------------------------
--  Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`(
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `nickname` varchar(50) NOT NULL COMMENT '用户昵称',
  `mobile` VARCHAR(20) NOT NULL COMMENT '手机号',
  `sex` int(11) unsigned NOT NULL DEFAULT 0 COMMENT '性别',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_userid` (`user_id`),
  KEY `idx_mobile` (`mobile`)
);