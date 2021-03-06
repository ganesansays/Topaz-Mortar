// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.view;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<FriendListView>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code FriendListView} and its
 * dependencies.
 * 
 * Being a {@code Provider<FriendListView>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<FriendListView>} and handling injection
 * of annotated fields.
 */
public final class FriendListView$$InjectAdapter extends Binding<FriendListView>
    implements MembersInjector<FriendListView> {
  private Binding<com.example.mortar.screen.FriendListScreen.Presenter> presenter;

  public FriendListView$$InjectAdapter() {
    super(null, "members/com.example.mortar.view.FriendListView", NOT_SINGLETON, FriendListView.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<com.example.mortar.screen.FriendListScreen.Presenter>) linker.requestBinding("com.example.mortar.screen.FriendListScreen$Presenter", FriendListView.class, getClass().getClassLoader());
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
   * satisfying the contract for {@code Provider<FriendListView>}.
   */
  @Override
  public void injectMembers(FriendListView object) {
    object.presenter = presenter.get();
  }
}
