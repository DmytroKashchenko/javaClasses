/*
package ua.dmytrokashchenko.lesson5.solid;

import java.util.Objects;

public class CombinePropertyProvider {
    private final PropertyProvider envPropertyProvider;
    private final PropertyProvider defaultPropertyProvider;

    public CombinePropertyProvider(PropertyProvider envPropertyProvider,
                                   PropertyProvider defaultPropertyProvider) {
        this.envPropertyProvider = envPropertyProvider;
        this.defaultPropertyProvider = defaultPropertyProvider;
    }

    public String getProperty(String propertyName) {
        final String propertyValue = envPropertyProvider.getProperty(PropertyName);
        return Objects.nonNull(propertyValue) ? propertyName : defaultPropertyProvider.getProperty(propertyName);
    }
}
*/
