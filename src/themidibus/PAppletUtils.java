package themidibus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class PAppletUtils {

    public static void registerDispose(Object holder, Object var1) {
        try {
            Object var2 = null;
            String var3 = "processing.core.PApplet";

            try {
                Class var4 = Class.forName(var3);
                Class var5 = Object.class;
                if (var5.isAssignableFrom(var4)) {
                    var2 = var4.newInstance();
                    var2 = var1;
                }
            } catch (Exception ignored) {
            }

            try {
                Method var13 = var2.getClass().getMethod("registerDispose", Object.class);

                try {
                    var13.invoke(var2, holder);
                } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException ignored) {
                }
            } catch (SecurityException | NoSuchMethodException ignored) {
            }
        } catch (NullPointerException var12) {
            System.err.println("Register Dispose\n" + var12);
        }
    }
}
