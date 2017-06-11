/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : app

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2017-06-11 01:07:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_equipment
-- ----------------------------
DROP TABLE IF EXISTS `tb_equipment`;
CREATE TABLE `tb_equipment` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` int(10) DEFAULT NULL COMMENT 'user主键',
  `kidid` int(10) DEFAULT NULL COMMENT '孩子id',
  `number` varchar(200) DEFAULT '' COMMENT '设备编号',
  `maxtime` decimal(10,2) unsigned DEFAULT NULL COMMENT '最高温度',
  `mintime` decimal(10,2) unsigned DEFAULT NULL COMMENT '最低温度',
  `isalarm` varchar(5) DEFAULT '1' COMMENT '是否报警(0:否1:是)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_equipment
-- ----------------------------

-- ----------------------------
-- Table structure for tb_kid
-- ----------------------------
DROP TABLE IF EXISTS `tb_kid`;
CREATE TABLE `tb_kid` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` int(10) DEFAULT NULL COMMENT 'user主键',
  `nickname` varchar(50) DEFAULT NULL COMMENT '昵称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `headurl` text COMMENT '头像url',
  `healthIssue` text COMMENT '健康问题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_kid
-- ----------------------------

-- ----------------------------
-- Table structure for tb_temp_record
-- ----------------------------
DROP TABLE IF EXISTS `tb_temp_record`;
CREATE TABLE `tb_temp_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `equipid` int(10) DEFAULT NULL COMMENT '设备id',
  `recordTime` datetime DEFAULT NULL COMMENT '测温时间',
  `temperature` decimal(10,2) unsigned DEFAULT NULL COMMENT '温度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_temp_record
-- ----------------------------

-- ----------------------------
-- Table structure for tb_tip
-- ----------------------------
DROP TABLE IF EXISTS `tb_tip`;
CREATE TABLE `tb_tip` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `tip_type` varchar(10) DEFAULT 'fever' COMMENT '贴士类型(fever,food,cool)',
  `content` text COMMENT '贴士内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_tip
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `isactive` varchar(5) DEFAULT '1' COMMENT '是否有效(0:无效 1：有效)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '1');
INSERT INTO `tb_user` VALUES ('2', '1');
INSERT INTO `tb_user` VALUES ('3', '1');
INSERT INTO `tb_user` VALUES ('4', '1');
INSERT INTO `tb_user` VALUES ('5', '1');
INSERT INTO `tb_user` VALUES ('6', '1');
INSERT INTO `tb_user` VALUES ('7', '1');

-- ----------------------------
-- Table structure for tb_user_auth
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_auth`;
CREATE TABLE `tb_user_auth` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` int(10) DEFAULT NULL COMMENT 'user主键',
  `identityType` varchar(15) DEFAULT 'phone' COMMENT '验证类型(username,phone,qq,weixin)',
  `identifier` varchar(50) DEFAULT NULL COMMENT '验证账号,openid',
  `credential` varchar(100) DEFAULT NULL COMMENT '验证凭证',
  `registerTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `salt` varchar(50) DEFAULT NULL COMMENT '验证盐',
  `tokenKey` varchar(255) DEFAULT NULL COMMENT 'tokenKey,access_token',
  `tokenTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT 'token失效时间',
  `loginTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '上次登录时间',
  `verified` varchar(5) DEFAULT '1' COMMENT '是否验证通过(0:无效1:有效)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user_auth
-- ----------------------------
INSERT INTO `tb_user_auth` VALUES ('1', '1', 'phone', '123', null, '2017-05-22 21:42:23', null, null, null, '2017-05-22 21:42:23', '1');
INSERT INTO `tb_user_auth` VALUES ('2', '1', 'qq', '1147468768', 'xxx', '2017-06-09 23:40:19', '123', 'xxx', '2017-07-09 23:40:19', '2017-06-09 23:40:19', '1');
INSERT INTO `tb_user_auth` VALUES ('7', '7', 'phone', '18615566651', '3f0b17baeaaf7d69f9d731d83ae5bf32', '2017-06-11 00:16:16', '[B@1571e0f6', '2de4e96238', '2017-07-11 01:00:28', '2017-06-11 01:00:28', '1');
