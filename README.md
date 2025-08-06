# Java Practice on macOS

## 1. Installing Java JDK on macOS
- Downloaded Java JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- Followed the installation instructions provided by Oracle for macOS.

## 2. Setting the Path for Java
- After installation, set the `JAVA_HOME` environment variable in the `.zshrc` or `.bash_profile` file:
  ```bash
  export JAVA_HOME=$(/usr/libexec/java_home)
  export PATH=$JAVA_HOME/bin:$PATH
  ```
- Saved the changes and ran the following command to apply the changes:
  ```bash
  source ~/.zshrc
  ```
- Verified the installation by running:
  ```bash
  java -version
  ```

## 3. Writing and Running My First Java Code
- Created a simple "Hello World" program as my first Java code:
  ```java
  public class q {
      public static void main(String[] args) {
          System.out.println("Hello World");
      }
  }
  ```
- Compiled and ran the code using:
  ```bash
  javac q.java
  java q
  ```

## 4. Writing a Program to Sum Two Numbers
- Wrote a program to calculate the sum of two numbers:
  ```java
  class Main {
      public static void main(String[] args) {
          int q = 2;
          int r = 1;
          int sum = q + r;
          System.out.println(sum);
      }
  }
  ```
- Compiled and ran the code using:
  ```bash
  javac Main.java
  java Main
  ```

## 5. Installing Eclipse IDE on macOS
- Downloaded Eclipse IDE from the [official Eclipse website](https://www.eclipse.org/downloads/).
- Followed the installation instructions to set up Eclipse IDE for Java development.