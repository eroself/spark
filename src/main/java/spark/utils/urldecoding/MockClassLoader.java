package spark.utils.urldecoding;

import java.net.URL;
import java.net.URLClassLoader;

public class MockClassLoader extends URLClassLoader {

    public MockClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public void addURL(URL url) {
        super.addURL(url);
    }
}
