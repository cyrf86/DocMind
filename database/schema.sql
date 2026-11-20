use docmind;

create table sys_user(
    id BIGINT PRIMARY  KEY  auto_increment comment '用户ID',
	username varchar(50) not null unique comment '用户名',
	email VARCHAR(100) not null unique coment '邮箱',
	password VARBINARY(255) NOT NULL comment '加密后的密码',
	create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
	update_time DATETIME DEFAULT CURRENT_TIMESTAMP on update current_timestamp
);

ALTER table knowledge_base 
ADD CONSTRAINT fk_knowledge_base_user
FOREIGN KEY (owner_id)
REFERENCES sys_user(id);