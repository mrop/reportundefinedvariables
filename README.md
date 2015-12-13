# elresolver
Logging undefined jsp variables

## Warning
This code adds an additional ELResolver. It should only be used on an development environment to fix the problems
described here.
NEVER add this to your production code, it could throw a JasperException at each jsp. It will most likely cause your
site not to render.

## Why
When using jsp as front-end technology and updating from tomcat 7 to tomcat 8
(https://tomcat.apache.org/migration-8.html#JavaServer_Pages_2.3) performance
problems can occur. Each time a variable is undefined it will be looked up in the classpath.

## Problem
In order to solve the performance problems, every variable that could potentially be undefined during the code flow
should be scoped.
In existing projects this is a time consuming task.

## Solution
Add this code as dependency in your spring module. Each time a variable is undefined a exception will occur at runtime. 
This enables you to quickly spot and fix all occurances of the problem and by the performance problems that are caused
by this behaviour.
