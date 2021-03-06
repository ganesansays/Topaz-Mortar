// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.view;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<LoginView>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code LoginView} and its
 * dependencies.
 * 
 * Being a {@code Provider<LoginView>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<LoginView>} and handling injection
 * of annotated fields.
 */
public final class LoginView$$InjectAdapter extends Binding<LoginView>
    implements MembersInjector<LoginView> {
  private Binding<com.example.mortar.screen.LoginScreen.Presenter> presenter;

  public LoginView$$InjectAdapter() {
    super(null, "members/com.example.mortar.view.LoginView", NOT_SINGLETON, LoginView.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<com.example.mortar.screen.LoginScreen.Presenter>) linker.requestBinding("com.example.mortar.screen.LoginScreen$Presenter", LoginView.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(presenter);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<LoginView>}.
   */
  @Override
  public void injectMembers(LoginView object) {
    object.presenter = presenter.get();
  }
}
