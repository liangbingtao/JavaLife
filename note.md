#1、注解说明
- @Autowired：自动装配，通过类型，名字；
    @Autowired通过byType的方式实现，而且必须要求这个对象存在，如果@Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value=“xxx”)【常用】
- @Nullable：字段标记了这个注解，说明这个字段可以为null
- @Resource：@Resource默认通过byName的方式实现，如果找不到名字，则通过byType实现！如果两个都找不到，就报错！【常用】
- @Component：组件，放在类上，说明这个类被Spring管理了，就是bean!