# **Java后端自学路线**

## 序幕

###### 想成为一名 Java 后端程序员，要求可不低。

**基础要求**：

- **Java 基础**：必须极其扎实。像**多线程、集合、I/O 流**，要深入理解原理并能熟练运用。

  **多线程**，不仅要知道怎么创建线程，还要清楚线程安全问题怎么解决，各种锁机制的应用场景。

  **集合**方面，不同集合类的优缺点、适用场景要了如指掌，在实际开发中能准确选择合适的集合。

  **I/O 流**要能根据不同的数据类型和业务场景，正确选择字节流或字符流进行高效的数据处理。

- **面向对象编程**：要精通**封装、继承、多态**的概念及应用，懂得如何设计良好的类结构，提高代码的可维护性和复用性。

**数据库知识**：

- **关系型数据库**：精通 MySQL 是基本要求。要熟练掌握数据库设计原则，能设计出合理的数据库表结构。

  SQL 语句要写得又快又准，包括复杂的查询、连接、分组、排序等操作，还要懂得数据库索引原理及优化，提升查询性能。

- **非关系型数据库**：Redis 必须掌握，了解它的数据结构，如字符串、哈希、列表、集合、有序集合等，知道在什么场景下使用哪种数据结构，以及如何利用 Redis 实现缓存、分布式锁等功能。

**框架方面**：

- **Spring 家族**：Spring Boot 要熟练掌握，能够快速搭建项目，整合各种中间件，理解自动配置原理。

  Spring Cloud 也要有所涉猎，了解微服务架构下的服务注册与发现、配置中心、熔断器等组件的原理及使用。

- **MyBatis**：掌握其 SQL 映射、动态 SQL 等功能，能实现 Java 对象与数据库表的高效交互。

**中间件**：

- **消息队列**：像 RabbitMQ、Kafka 要熟悉，明白消息队列的应用场景，如异步处理、削峰填谷等，掌握消息的发送、接收及可靠性保证机制。
- **缓存**：除了 Redis，对 Memcached 等也应有所了解，理解缓存穿透、缓存雪崩、缓存击穿等问题及解决方案。

**其他**：

- **设计模式**：熟悉常用设计模式，如单例模式、工厂模式、代理模式等，在实际开发中能合理运用设计模式优化代码结构，提高可扩展性。
- **Linux 基础**：掌握基本的 Linux 命令，如文件操作、权限管理、进程管理等，因为很多 Java 项目都是部署在 Linux 服务器上。

只有书本概念，那就需要大量实践。可以先从简单的 Java 项目入手，比如 Web 项目，利用 Spring Boot 搭建项目骨架，整合 MyBatis 操作数据库，使用 MySQL 存储数据。接着尝试引入 Redis 缓存，消息队列等中间件，一步步提升自己的实践能力。同时，多参与开源项目，学习别人的代码结构和开发思路。



##### 二级 Java 考试存在一定局限性。

它**侧重于基础知识的考查，覆盖的知识点虽广，但深度往往不够**。比如对于集合、多线程这些关键内容，考试可能仅涉及表面概念，不会深入到实际应用场景及底层原理。

然而，也不能完全否定它的价值。对于初学者，准备计算机二级考试能帮助你系统梳理 Java 基础知识框架，让你对 Java 有一个较为全面的初步认识。但要成为一名合格的 Java 后端程序员，仅靠计算机二级的知识远远不够。你需要在其基础上，深入钻研像集合源码、多线程并发控制这样的重点难点，掌握主流框架和中间件，积累项目实践经验。所以，别因为它有不足就轻视之前学习的收获，而是要以其为起点，朝着更专业、更深入的方向继续学习。



##### 只有书本概念，实践经验匮乏，强烈建议先扎实巩固 Java 基础。

Java 基础是整个 Java 编程体系的基石。多线程、集合、I/O 流等基础知识如果理解不深，在实际项目开发中会遇到诸多阻碍。例如，不透彻理解多线程的同步机制，在处理并发业务时就极易出现数据不一致等严重问题；对集合的底层原理若掌握不好，选择了不恰当的集合类，可能导致程序性能低下。

只有将这些基础打牢，你在接触项目时才能更顺畅。比如在 Spring Boot 项目中，无论是处理请求数据（可能涉及集合操作），还是实现异步任务（需要多线程知识），扎实的基础都能让你更快上手。

等你对 Java 基础有了较为深入且熟练的掌握后，再着手进行简单 Java 项目开发。通过项目实践进一步巩固知识，同时学习项目开发流程、架构设计等实际应用技能，这样循序渐进的学习路径能让你更稳健地成长为一名合格的 Java 后端程序员。



##### 关于 Android Studio ，如果你的目标是成为 Java 后端程序员，它并非核心重点，但了解一些基础知识也有好处。

Android 开发主要侧重于移动端应用，与后端开发的业务逻辑处理、数据存储交互等重点不太一样。不过掌握 Android 基础知识能让你对整个移动开发生态有更全面的理解，尤其在前后端交互方面可能会有帮助。

而 **JSP，在如今的 Java Web 开发中，其使用场景已逐渐减少**。

现代 Java Web 开发更多倾向于使用前后端分离架构，前端使用 Vue.js、React 等框架构建用户界面，后端提供 RESTful API 接口。但 JSP 作为 Java Web 发展历程中的重要技术，了解它有助于你理解 Web 开发的演变过程，对一些遗留项目的维护也可能有帮助。如果时间有限，**不将其作为重点学习也无妨，把精力更多放在主流的后端开发技术上**。总之，两者都不是当下 Java 后端程序员核心必备技能，但了解它们能拓宽你的知识面。



##### 对于 Java 后端程序员来说，正则表达式是非常值得学习且有必要掌握的一项技能。

在实际开发中，很多场景都会用到正则表达式。比如在数据验证方面，当你接收前端传来的数据时，像邮箱地址、手机号码、身份证号码等格式的验证，使用正则表达式可以简洁高效地完成。在文本处理上，如果你需要从一段文本中提取特定格式的信息，或者替换符合某种模式的字符串，正则表达式就派上用场了，例如从日志文件中提取特定格式的时间戳。

在 Java 中，通过`java.util.regex`包提供了对正则表达式的支持，包括`Pattern`和`Matcher`类等。掌握正则表达式，能让你在处理字符串相关业务逻辑时更加得心应手，提升代码的简洁性和效率。所以，别忽视对正则表达式的学习，它会成为你开发工具库中的有力武器。



##### 如果你的目标是成为 Java 后端程序员，Java GUI 并不是重点学习内容。

Java GUI 主要用于开发桌面应用程序，比如 Swing 和 AWT 等技术。

然而，当下后端开发主要聚焦于服务器端编程，处理业务逻辑、数据库交互、提供 API 接口等，与前端通过网络进行数据交互。在这个过程中，很少会涉及到 Java GUI 相关内容。

但如果你对跨平台桌面应用开发感兴趣，或者想拓展自己的技能边界，了解一些 Java GUI 知识也无妨。只是从主流的 Java 后端开发岗位需求来看，将大量时间投入到 Java GUI 学习上并非明智之举，你更应该把精力放在诸如多线程、集合、I/O、数据库、后端框架（如 Spring Boot 等）以及中间件等关键领域。



##### 在当下的 Java 后端开发领域，MySQL 的应用远比 SQL Server 更为广泛。

MySQL 是开源数据库，具有**成本低、性能高、可扩展性强等优点，尤其适合用于互联网项目的开发**。众多互联网公司，从小型创业公司到大型科技企业，都广泛使用 MySQL 来存储和管理数据。

在学习 MySQL 过程中，你不仅要掌握基本的 SQL 语句，如数据定义（DDL）、数据操作（DML）、数据查询（DQL），还要深入理解数据库设计原则、索引优化、事务管理等内容，这对于开发高效稳定的后端应用至关重要。

虽然你在大学里学习了 SQL Server，但**如果你的目标是 Java 后端开发，建议你着重学习 MySQL**。当然，SQL Server 也有其优势，在一些传统企业级项目中仍有应用，如果你对传统企业开发方向感兴趣，或者未来有可能接触到相关项目，SQL Server 的知识也可作为补充。但就主流的 Java 后端开发趋势而言，MySQL 是优先且必须掌握的数据库技术。



##### 对于多线程、I/O 和集合，吃透它们可不光是记住概念。

多线程要深入到源码级别，比如线程池的实现原理，ThreadPoolExecutor 类中各个参数的作用和对线程池运行的影响，还要能熟练运用并发包下的各种工具类解决实际问题。

I/O 流不仅要会基本的文件读写，还要掌握网络 I/O，像 NIO（New I/O）的多路复用机制，对比传统 I/O 理解其优势和适用场景。

集合则要对每个常用集合类的源码了如指掌，像 HashMap 的哈希算法、扩容机制，以及如何优化其性能等。

等你觉得这些基础已经扎实了，再逐步深入到数据库、框架和中间件等方面的学习，稳扎稳打，才能真正成为一名优秀的 Java 后端程序员。

# 现在我们开始学习Java SE中的基础

## 遗漏知识点

##### int 与 Integer

int 是 Java 的基本数据类型，**Integer 是 int 对应的包装类**。

首先，从存储方式来说，**int 变量直接存储数值，占用 4 个字节**，存储在栈中（局部变量情况下）。而 **Integer 对象是引用类型**，存储的是对象的引用，对象本身存储在堆中，**占用空间相对较大**。

在使用场景上，基本数据类型 int 通常用于简单的数值运算，性能更高，因为不需要像对象那样进行复杂的创建和管理过程。Integer 更多用于需要将 int 作为对象处理的场景，比如在集合框架中，因为**集合只能存储对象类型，所以要使用 Integer**。

关于默认值，**int 的默认值是 0，而 Integer 的默认值是 null**。这在涉及到空值判断等逻辑时非常关键，如果使用不当可能会引发空指针异常。

在进行一些自动装箱和拆箱操作时，Java 5.0 引入了自动装箱（将 int 自动转换为 Integer）和拆箱（将 Integer 自动转换为 int）机制。虽然这在一定程度上简化了代码，但也要理解其原理，因为在某些复杂场景下，比如在循环中频繁进行装箱拆箱操作，会影响性能。

所以，不能简单认为 int 和 Integer 的区别只是包装类，要全面理解它们在存储、使用场景、默认值以及装箱拆箱等多方面的差异。



## 学习方向

#### **先学习泛型和多态，对理解集合会有极大帮助。**

泛型与集合紧密相关，集合框架大量运用了泛型。比如`List<String>`明确了该列表只能存放`String`类型元素，这不仅增强了类型安全性，还避免了类型转换异常。掌握泛型能让你更清晰地理解集合如何处理不同类型的数据，编写更健壮、通用的集合操作代码。

多态在集合场景中也有体现。例如，你可以将不同子类对象放入以父类类型定义的集合中，利用多态特性对这些对象进行统一操作，这在面向对象编程中是常见的设计方式。

**先学习泛型和多态，能为学习集合打下良好基础，让你在学习集合时理解更深入、学习更高效。**若直接学习集合，后续再回头学泛型和多态，可能在理解集合一些特性和用法时会有阻碍，还需重新梳理相关知识。因此，建议你先完成泛型和多态的学习，再进入集合的学习。



#### **泛型和多态是 Java 的核心特性。**

泛型允许你在定义类、接口和方法时使用类型参数，使得代码能够适应不同的数据类型，提高了代码的复用性和类型安全性。比如在集合框架中，泛型就发挥了巨大作用，像`List<String>`明确表明这个列表只能存放字符串类型的数据，避免了运行时的类型错误。如果不掌握泛型，在实际开发中处理集合等数据结构时会遇到诸多不便，代码也会变得冗长且容易出错。

多态是面向对象编程的重要特性之一。它基于继承和接口实现，使得同一个方法调用在不同的对象上可以产生不同的行为。比如一个父类引用可以指向子类对象，通过这个父类引用调用子类重写后的方法，就体现了多态。多态让代码更具灵活性和扩展性，当有新的子类加入时，无需修改太多原有代码，只需要在子类中实现相应方法即可。在大型项目的架构设计中，多态无处不在，对提高代码的可维护性和复用性至关重要。

**泛型和多态是 Java 开发必须掌握的关键内容，绝不能忽视。**



**集合相对来说可以最先学**。集合在 Java 编程中应用极为广泛，是日常开发中频繁使用的基础部分。掌握集合框架能够快速上手一些简单的 Java 程序编写，建立起对 Java 编程实用性的初步认识。而且集合的学习难度相对没那么高，其原理和操作比较直观，通过学习集合，能快速熟悉 Java 的泛型等基础语法特性。

**多线程和 I/O 流相比集合要复杂一些**。多线程涉及到并发编程的概念，对逻辑思维要求较高，理解线程的生命周期、线程同步、死锁等问题需要花费较多精力。

I/O 流虽然理解起来不算特别难，但要掌握不同类型流的使用场景、字节流与字符流的区别等细节，也需要一定时间。

**建议先从集合入手，打下一定基础后，再学习 I/O 流，最后攻克多线程。这样循序渐进，有助于更好地吸收知识。**



### 范型



### 多态

### 集合

### I/O 流

### 多线程

1. 概念理解

   - 多线程允许程序同时执行多个任务，提高程序的效率和响应性。线程是进程中的一个执行单元。

     你要理解线程的生命周期，包括新建（New）、就绪（Runnable）、运行（Running）、阻塞（Blocked）和死亡（Dead）状态，以及状态之间是如何转换的。

   - 重点掌握线程同步的概念，由于多个线程可能同时访问共享资源，会导致数据不一致等问题，所以需要同步机制来保证数据的完整性。像`synchronized`关键字、`Lock`接口等都是实现线程同步的方式。

2. 实践

   - 首先可以通过继承`Thread`类或实现`Runnable`接口来创建和启动线程，编写简单的多线程程序，观察线程的执行顺序，感受线程的并发执行。
   - 接着尝试在多线程环境中共享数据，比如多个线程对同一个计数器进行操作，这时候就会出现线程安全问题，你可以用`synchronized`关键字来解决，看看同步前后的区别。
   - 还可以研究下`java.util.concurrent`包下的工具类，比如`ExecutorService`、`Future`等，它们提供了更高级的线程管理和异步执行的功能。