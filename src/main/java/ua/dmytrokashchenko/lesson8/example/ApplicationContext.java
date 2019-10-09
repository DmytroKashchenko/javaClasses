package ua.dmytrokashchenko.lesson8.example;

import ua.dmytrokashchenko.lesson8.example.model.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public final class ApplicationContext {

//    public static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();
//    public static final UserService USER_SERVICE = new UserServiceImpl(USER_REPOSITORY);
//    public static void registerElements() {
//    }

    public final Map<String, Object> stringObjectMap = new HashMap<>();

    public void run() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // scan packages
//        List<Class> classes = new ArrayList<>();
        List<Class> classes = Arrays.asList(User.class, UserService.class,
                UserServiceImpl.class, UserRepository.class, UserRepositoryImpl.class);

        List<Class> components = new ArrayList<>();
        for (int i = 0; i <classes.size(); i++) {
            Class clazz = classes.get(i);
            if (clazz.isAnnotationPresent(Component.class)) {
                components.add(clazz);
            }
        }

        //analise
        stringObjectMap.put("UserRepositoryImpl", new UserRepositoryImpl());

        Class<UserServiceImpl> userServiceClass = UserServiceImpl.class;
        Constructor<?>[] constructors = userServiceClass.getDeclaredConstructors();
        Constructor<?> constructor = constructors[0];

        Class<?>[] parameterTypes = constructor.getParameterTypes();

        Object userRepositoryImpl = constructor.newInstance(stringObjectMap.get("UserRepositoryImpl"));

        stringObjectMap.put("userServiceImpl", userRepositoryImpl);


    }

}
