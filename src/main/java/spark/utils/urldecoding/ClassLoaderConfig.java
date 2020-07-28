package spark.utils.urldecoding;

import java.net.URL;

/**
 * This class has been created to make the code compatible after migration to Java 11
 * From the JDK 9 release notes: "The application class loader is no longer an instance of
 * java.net.URLClassLoader (an implementation detail that was never specified in previous releases).
 * Code that assumes that ClassLoader.getSytemClassLoader() returns a URLClassLoader object will
 * need to be updated. Note that Java SE and the JDK do not provide an API for applications or
 * libraries to dynamically augment the class path at run-time."
 */

public class ClassLoaderConfig {

    private final MockClassLoader classLoader;

    public ClassLoaderConfig() {
        this.classLoader = new MockClassLoader(new URL[0], this.getClass().getClassLoader());
    }

    public MockClassLoader getClassLoader() {
        return this.classLoader;
    }
}
