# customAnnotation
学习自定义注解

### 元注解
注解就是某种注解类型的一种实例，我们可以把它用在某个类上进行标注。注解大体分为三种：元注解，标记注解，一般注解。
1. @Target,
2. @Retention,
3. @Documented,
4. @Inherited

#### @Target
说明了Annotation所修饰的对象范围,常用ElementType.TYPE

ElementType：
1. CONSTRUCTOR:用于描述构造器
2. FIELD:用于描述符
3. LOCAL_VARIABLE:用于描述局部变量
4. METHOD:用于描述方法
5. PACKAGE:用于描述包
6. PARAMETER: 用于描述参数
7. TYPE: 用于描述类、接口（包括注解类型）或者enum声明

#### @Retention
定义了该Annotation被保留的时间长短

RetentionPoicy）：
1. SOURCE:在源文件中有效（即源文件保留）
2. CLASS:在class文件中有效（即class保留）
3. RUNTIME:在运行时有效（即运行时保留）

#### @Documented
描述其它类型的annotation应该被作为被标注的程序成员的公共API，没有成员
#### @Inherited
阐述了某个被标注的类型是被继承的，没有成员

### 自定义格式
public @interface 注解名 {定义体}
1. 创建接口文件
2. 编写实现类
  1. 使用aop的方式
  2. 使用bean（待定）
3. 编写主程序调用
