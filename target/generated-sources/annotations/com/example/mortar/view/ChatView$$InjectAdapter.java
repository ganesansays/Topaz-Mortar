// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.view;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<ChatView>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code ChatView} and its
 * dependencies.
 * 
 * Being a {@code Provider<ChatView>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<ChatView>} and handling injection
 * of annotated fields.
 */
public final class ChatView$$InjectAdapter extends Binding<ChatView>
    implements MembersInjector<ChatView> {
  private Binding<com.example.mortar.screen.ChatScreen.Presenter> presenter;

  public ChatView$$InjectAdapter() {
    super(null, "members/com.example.mortar.view.ChatView", NOT_SINGLETON, ChatView.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<com.example.mortar.screen.ChatScreen.Presenter>) linker.requestBinding("com.example.mortar.screen.ChatScreen$Presenter", ChatView.class, getClass().getClassLoader());
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
   * satisfying the contract for {@code Provider<ChatView>}.
   */
  @Override
  public void injectMembers(ChatView object) {
    object.presenter = presenter.get();
  }
}