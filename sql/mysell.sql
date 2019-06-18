/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.0.16 : Database - mysell
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mysell` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `mysell`;

/*Table structure for table `comment_info` */

DROP TABLE IF EXISTS `comment_info`;

CREATE TABLE `comment_info` (
  `id` bigint(11) NOT NULL COMMENT '唯一标识',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信用户ID',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `content` varchar(255) DEFAULT NULL COMMENT '评论',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户评论表';

/*Data for the table `comment_info` */

/*Table structure for table `order_detail_info` */

DROP TABLE IF EXISTS `order_detail_info`;

CREATE TABLE `order_detail_info` (
  `id` bigint(11) NOT NULL COMMENT '唯一标识',
  `order_id` bigint(11) DEFAULT NULL COMMENT '订单id',
  `product_id` bigint(11) DEFAULT NULL COMMENT '商品ID',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `product_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `product_quantity` int(255) DEFAULT NULL COMMENT '商品数量',
  `product_icon` varchar(255) DEFAULT NULL COMMENT '小图',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单详情表';

/*Data for the table `order_detail_info` */

/*Table structure for table `order_master_info` */

DROP TABLE IF EXISTS `order_master_info`;

CREATE TABLE `order_master_info` (
  `id` bigint(11) NOT NULL COMMENT '唯一标识',
  `buyer_name` varchar(255) DEFAULT NULL COMMENT '买家姓名',
  `buyer_phone` varchar(255) DEFAULT NULL COMMENT '买家手机号',
  `buyer_address` int(11) DEFAULT NULL COMMENT '买家桌号',
  `buyer_openid` varchar(255) DEFAULT NULL COMMENT '买家微信openID',
  `order_amount` decimal(20,0) NOT NULL COMMENT '订单总金额',
  `order_status` int(11) DEFAULT '0' COMMENT '订单状态',
  `pay_status` int(11) DEFAULT '0' COMMENT '支付状态',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_master_info` */

/*Table structure for table `product_category` */

DROP TABLE IF EXISTS `product_category`;

CREATE TABLE `product_category` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `category_name` varchar(255) DEFAULT NULL COMMENT '类目名称',
  `category_type` varchar(255) DEFAULT NULL COMMENT '类目编号',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='商品类别表';

/*Data for the table `product_category` */

insert  into `product_category`(`id`,`category_name`,`category_type`,`create_time`,`update_time`) values 
(1,'洗漱用品','1','2019-04-29 18:14:15','2019-04-23 18:14:17'),
(2,'凉用品','2','2019-04-29 18:14:15','2019-04-23 18:14:17');

/*Table structure for table `product_info` */

DROP TABLE IF EXISTS `product_info`;

CREATE TABLE `product_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `product_price` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `product_stock` int(11) DEFAULT NULL COMMENT '库存',
  `product_description` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `productIcon` varchar(255) DEFAULT NULL COMMENT '商品小图',
  `product_status` int(11) DEFAULT NULL COMMENT '商品上下架 1正常 2下架',
  `category_type` int(11) DEFAULT NULL COMMENT '类目编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='商品信息表';

/*Data for the table `product_info` */

insert  into `product_info`(`id`,`product_name`,`product_price`,`product_stock`,`product_description`,`productIcon`,`product_status`,`category_type`,`create_time`,`update_time`) values 
(1,'西瓜霜',55.50,20,'这西瓜霜真好啊','http://img10.360buyimg.com/n7/jfs/t2707/265/1369306636/53753/5a7dbc80/573d5387Nf3db6a11.jpg',1,NULL,'2019-04-29 16:49:29','2019-04-29 16:49:32'),
(2,'西瓜霜2',55.50,20,'这西瓜霜真好啊','http://img10.360buyimg.com/n7/jfs/t2707/265/1369306636/53753/5a7dbc80/573d5387Nf3db6a11.jpg',1,NULL,'2019-04-29 16:49:29','2019-04-29 16:49:32'),
(3,'西瓜霜3',55.50,20,'这西瓜霜真好啊','//img13.360buyimg.com/n7/jfs/t27007/271/935631116/263959/8271942d/5bbda5d7N833df50a.jpg',1,NULL,'2019-04-29 16:49:29','2019-04-29 16:49:32');

/*Table structure for table `seller_info` */

DROP TABLE IF EXISTS `seller_info`;

CREATE TABLE `seller_info` (
  `id` bigint(11) NOT NULL COMMENT '唯一标识',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `pass_word` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `phone` varchar(255) DEFAULT NULL COMMENT '用户手机',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家信息表';

/*Data for the table `seller_info` */

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `phone` varchar(255) DEFAULT NULL COMMENT '用户手机号',
  `openid` varchar(255) DEFAULT NULL COMMENT '用户微信号ID',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='买家信息表';

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`user_name`,`phone`,`openid`,`birthday`,`createTime`,`updateTime`) values 
(1,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:24'),
(2,'王少彬2','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:42'),
(3,'王少彬3','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:42'),
(4,'王少彬4','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:42'),
(5,'王少彬5','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:42'),
(6,'王少彬6','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:42'),
(7,'王少彬7','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(8,'王少彬8','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(9,'王少彬9','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(10,'王少彬10','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(11,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(12,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:43'),
(13,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:44'),
(14,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:44'),
(15,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:44'),
(16,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:44'),
(17,'王少彬','15210492012','11152','2019-06-17',NULL,'2019-06-18 02:49:44');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
