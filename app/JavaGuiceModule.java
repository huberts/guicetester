import com.google.inject.AbstractModule;
import models.Module5;
import models.Module5Impl;
import models.Module6;
import models.Module6Impl;

/**
 * Created by hswietlicki on 2016-04-13.
 */
public class JavaGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Module5.class).to(Module5Impl.class);
        bind(Module6.class).to(Module6Impl.class);
    }
}
