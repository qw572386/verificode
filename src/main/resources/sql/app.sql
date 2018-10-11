/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : app

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-10-11 07:11:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for verificode
-- ----------------------------
DROP TABLE IF EXISTS `verificode`;
CREATE TABLE `verificode` (
  `codeId` varchar(100) NOT NULL COMMENT '主键id',
  `tId` varchar(10) NOT NULL COMMENT '项目编号',
  `phoneNumber` varchar(11) NOT NULL COMMENT '手机号',
  `codeContent` varchar(255) NOT NULL COMMENT '验证码内容',
  PRIMARY KEY (`codeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
