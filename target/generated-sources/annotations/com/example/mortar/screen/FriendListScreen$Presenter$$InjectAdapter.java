// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.screen;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<FriendListScreen.Presenter>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code FriendListScreen.Presenter} and its
 * dependencies.
 * 
 * Being a {@code Provider<FriendListScreen.Presenter>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<FriendListScreen.Presenter>} and handling injection
 * of annotated fields.
 */
public final class FriendListScreen$Presenter$$InjectAdapter extends Binding<FriendListScreen.Presenter>
    implements Provider<FriendListScreen.Presenter>, MembersInjector<FriendListScreen.Presenter> {
  private Binding<java.util.List<com.example.mortar.model.User>> friends;
  private Binding<flow.Flow> flow;
  private Binding<mortar.ViewPresenter> supertype;

  public FriendListScreen$Presenter$$InjectAdapter() {
    super("com.example.mortar.screen.FriendListScreen$Presenter", "members/com.example.mortar.screen.FriendListScreen$Presenter", IS_SINGLETON, FriendListScreen.Presenter.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    friends = (Binding<java.util.List<com.example.mortar.model.User>>) linker.requestBinding("java.util.List<com.example.mortar.model.User>", FriendListScreen.Presenter.class, getClass().getClassLoader());
    flow = (Binding<flow.Flow>) linker.requestBinding("flow.Flow", FriendListScreen.Presenter.class, getClass().getClassLoader());
    supertype = (Binding<mortar.ViewPresenter>) linker.requestBinding("members/mortar.ViewPresenter", FriendListScreen.Presenter.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    getBindings.add(friends);
    getBindings.add(flow);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<FriendListScreen.Presenter>}.
   */
  @Override
  public FriendListScreen.Presenter get() {
    FriendListScreen.Presenter result = new FriendListScreen.Presenter(friends.get(), flow.get());
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<FriendListScreen.Presenter>}.
   */
  @Override
  public void injectMembers(FriendListScreen.Presenter object) {
    supertype.injectMembers(object);
  }
}