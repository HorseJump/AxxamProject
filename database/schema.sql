Drop table admin_users;

Create table admin_users (
    adminUser_id serial not null,
    adminUsername varchar(20) not null,
    adminPassword varchar(20) not null
    );
   
Insert Into admin_users (adminUsername, adminPassword) Values ('admin', 'admin');
    
Select * From admin_users;