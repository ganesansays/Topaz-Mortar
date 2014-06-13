// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.view;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<FriendView>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code FriendView} and its
 * dependencies.
 * 
 * Being a {@code Provider<FriendView>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<FriendView>} and handling injection
 * of annotated fields.
 */
public final class FriendView$$InjectAdapter extends Binding<FriendView>
    implements MembersInjector<FriendView> {
  private Binding<com.example.mortar.screen.FriendScreen.Presenter> presenter;

  public FriendView$$InjectAdapter() {
    super(null, "members/com.example.mortar.view.FriendView", NOT_SINGLETON, FriendView.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<com.example.mortar.screen.FriendScreen.Presenter>) linker.requestBinding("com.example.mortar.screen.FriendScreen$Presenter", FriendView.class, getClass().getClassLoader());
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
   * satisfying the contract for {@code Provider<FriendView>}.
   */
  @Override
  public void injectMembers(FriendView object) {
    object.presenter = presenter.get();
  }
}