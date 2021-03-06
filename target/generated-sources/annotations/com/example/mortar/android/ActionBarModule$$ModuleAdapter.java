// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.android;


import dagger.internal.Binding;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class ActionBarModule$$ModuleAdapter extends ModuleAdapter<ActionBarModule> {
  private static final String[] INJECTS = { "members/com.example.mortar.DemoActivity", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public ActionBarModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  @Override
  public ActionBarModule newModule() {
    return new com.example.mortar.android.ActionBarModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("com.example.mortar.android.ActionBarOwner", new ProvideActionBarOwnerProvidesAdapter(module));
  }

  /**
   * A {@code Binder<com.example.mortar.android.ActionBarOwner>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.example.mortar.android.ActionBarOwner>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideActionBarOwnerProvidesAdapter extends Binding<ActionBarOwner>
      implements Provider<ActionBarOwner> {
    private final ActionBarModule module;

    public ProvideActionBarOwnerProvidesAdapter(ActionBarModule module) {
      super("com.example.mortar.android.ActionBarOwner", null, IS_SINGLETON, "com.example.mortar.android.ActionBarModule.provideActionBarOwner()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.example.mortar.android.ActionBarOwner>}.
     */
    @Override
    public ActionBarOwner get() {
      return module.provideActionBarOwner();
    }
  }
}
