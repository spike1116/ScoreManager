-- we don't know how to generate root <with-no-name> (class Root) :(
create table course
(
    c_id       int auto_increment
        primary key,
    c_name     varchar(255)        null,
    c_credit   double              null,
    c_year     year default '2022' null,
    c_semester int                 null comment '0:上学期 1:下学期',
    t_id       int                 null comment 't_id'
)
    engine = InnoDB;

create table `index`
(
    d_id         int auto_increment
        primary key,
    c_id         int    not null,
    t_id         int    not null,
    d_regular    double null,
    d_attend     double null,
    d_homework   double null,
    d_middle     double null,
    d_expirement double null,
    d_final      double null
)
    engine = InnoDB;

create table score
(
    sc_id         int auto_increment
        primary key,
    c_id          int           null,
    t_id          int           null,
    s_id          int           null,
    sc_regular    double        null,
    sc_homework   double        null,
    sc_middle     double        null,
    sc_expirement double        null,
    sc_final      double        null,
    sc_retake     int default 1 null comment '0:重修 1:正常',
    sc_makeup     int           null comment '0:补考 1:正考',
    sc_grade      double        null comment '绩点计算方式为 最终成绩/10-5',
    sc_finalscore double        null
)
    engine = InnoDB;

create table student
(
    s_id    int auto_increment
        primary key,
    s_name  varchar(255)  not null,
    deleted int default 1 null comment '0:已删除，1:表示未删除'
)
    engine = InnoDB;

create table takecourse
(
    tc_id  int           not null comment '选课表'
        primary key,
    s_id   int           null,
    c_id   int           null,
    retake int default 1 null comment '0:重修 1:非重修',
    makeup int default 1 null comment '0:补考 1:非补考'
)
    engine = InnoDB;

create table teacher
(
    t_id    int auto_increment
        primary key,
    t_name  varchar(255)  not null,
    deleted int default 1 null comment '0:已删除，1:未删除'
)
    engine = InnoDB;

create table user
(
    u_id    int auto_increment
        primary key,
    u_name  varchar(255)  null,
    u_login varchar(255)  not null,
    u_pwd   varchar(255)  null,
    u_role  int           not null comment '0:管理员,1:老师,2:学生',
    deleted int default 1 null comment '0:已删除,1:未删除'
)
    engine = InnoDB;

