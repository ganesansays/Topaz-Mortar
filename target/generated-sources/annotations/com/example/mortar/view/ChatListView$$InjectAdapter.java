// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.view;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<ChatListView>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code ChatListView} and its
 * dependencies.
 * 
 * Being a {@code Provider<ChatListView>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<ChatListView>} and handling injection
 * of annotated fields.
 */
public final class ChatListView$$InjectAdapter extends Binding<ChatListView>
    implements MembersInjector<ChatListView> {
  private Binding<com.example.mortar.screen.ChatListScreen.Presenter> presenter;

  public ChatListView$$InjectAdapter() {
    super(null, "members/com.example.mortar.view.ChatListView", NOT_SINGLETON, ChatListView.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<com.example.mortar.screen.ChatListScreen.Presenter>) linker.requestBinding("com.example.mortar.screen.ChatListScreen$Presenter", ChatListView.class, getClass().getClassLoader());
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
   * satisfying the contract for {@code Provider<ChatListView>}.
   */
  @Override
  public void injectMembers(ChatListView object) {
    object.presenter = presenter.get();
  }
}
