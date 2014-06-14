// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.core;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class ApplicationModule$$ModuleAdapter extends ModuleAdapter<ApplicationModule> {
  private static final String[] INJECTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { com.example.mortar.model.Login.Module.class, };

  public ApplicationModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  @Override
  public ApplicationModule newModule() {
    return new com.example.mortar.core.ApplicationModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("@com.example.mortar.core.MainThread()/rx.Scheduler", new ProvideMainThreadProvidesAdapter(module));
    map.put("com.google.gson.Gson", new ProvideGsonProvidesAdapter(module));
    map.put("flow.Parcer<java.lang.Object>", new ProvideParcerProvidesAdapter(module));
    map.put("com.example.mortar.repository.LoginService", new ProvideLoginServiceProvidesAdapter(module));
    map.put("com.example.mortar.repository.LeadService", new ProvideLeadServiceProvidesAdapter(module));
    map.put("com.example.mortar.repository.CustomerService", new ProvideCustomerServiceProvidesAdapter(module));
  }

  /**
   * A {@code Binder<rx.Scheduler>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<rx.Scheduler>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideMainThreadProvidesAdapter extends Binding<rx.Scheduler>
      implements Provider<rx.Scheduler> {
    private final ApplicationModule module;

    public ProvideMainThreadProvidesAdapter(ApplicationModule module) {
      super("@com.example.mortar.core.MainThread()/rx.Scheduler", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideMainThread()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<rx.Scheduler>}.
     */
    @Override
    public rx.Scheduler get() {
      return module.provideMainThread();
    }
  }

  /**
   * A {@code Binder<com.google.gson.Gson>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.google.gson.Gson>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideGsonProvidesAdapter extends Binding<com.google.gson.Gson>
      implements Provider<com.google.gson.Gson> {
    private final ApplicationModule module;

    public ProvideGsonProvidesAdapter(ApplicationModule module) {
      super("com.google.gson.Gson", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideGson()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.google.gson.Gson>}.
     */
    @Override
    public com.google.gson.Gson get() {
      return module.provideGson();
    }
  }

  /**
   * A {@code Binder<flow.Parcer<java.lang.Object>>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code flow.Parcer<java.lang.Object>} and its
   * dependencies.
   * 
   * Being a {@code Provider<flow.Parcer<java.lang.Object>>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideParcerProvidesAdapter extends Binding<flow.Parcer<Object>>
      implements Provider<flow.Parcer<Object>> {
    private final ApplicationModule module;
    private Binding<com.google.gson.Gson> gson;

    public ProvideParcerProvidesAdapter(ApplicationModule module) {
      super("flow.Parcer<java.lang.Object>", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideParcer()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      gson = (Binding<com.google.gson.Gson>) linker.requestBinding("com.google.gson.Gson", ApplicationModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(gson);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<flow.Parcer<java.lang.Object>>}.
     */
    @Override
    public flow.Parcer<Object> get() {
      return module.provideParcer(gson.get());
    }
  }

  /**
   * A {@code Binder<com.example.mortar.repository.LoginService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.example.mortar.repository.LoginService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLoginServiceProvidesAdapter extends Binding<com.example.mortar.repository.LoginService>
      implements Provider<com.example.mortar.repository.LoginService> {
    private final ApplicationModule module;

    public ProvideLoginServiceProvidesAdapter(ApplicationModule module) {
      super("com.example.mortar.repository.LoginService", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideLoginService()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.example.mortar.repository.LoginService>}.
     */
    @Override
    public com.example.mortar.repository.LoginService get() {
      return module.provideLoginService();
    }
  }

  /**
   * A {@code Binder<com.example.mortar.repository.LeadService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.example.mortar.repository.LeadService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLeadServiceProvidesAdapter extends Binding<com.example.mortar.repository.LeadService>
      implements Provider<com.example.mortar.repository.LeadService> {
    private final ApplicationModule module;

    public ProvideLeadServiceProvidesAdapter(ApplicationModule module) {
      super("com.example.mortar.repository.LeadService", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideLeadService()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.example.mortar.repository.LeadService>}.
     */
    @Override
    public com.example.mortar.repository.LeadService get() {
      return module.provideLeadService();
    }
  }

  /**
   * A {@code Binder<com.example.mortar.repository.CustomerService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.example.mortar.repository.CustomerService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideCustomerServiceProvidesAdapter extends Binding<com.example.mortar.repository.CustomerService>
      implements Provider<com.example.mortar.repository.CustomerService> {
    private final ApplicationModule module;

    public ProvideCustomerServiceProvidesAdapter(ApplicationModule module) {
      super("com.example.mortar.repository.CustomerService", null, IS_SINGLETON, "com.example.mortar.core.ApplicationModule.provideCustomerService()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.example.mortar.repository.CustomerService>}.
     */
    @Override
    public com.example.mortar.repository.CustomerService get() {
      return module.provideCustomerService();
    }
  }
}
