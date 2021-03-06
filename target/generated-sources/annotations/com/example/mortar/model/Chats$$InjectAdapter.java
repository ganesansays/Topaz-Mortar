// Code generated by dagger-compiler.  Do not edit.
package com.example.mortar.model;


import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<Chats>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code Chats} and its
 * dependencies.
 * 
 * Being a {@code Provider<Chats>} and handling creation and
 * preparation of object instances.
 */
public final class Chats$$InjectAdapter extends Binding<Chats>
    implements Provider<Chats> {
  private Binding<rx.Scheduler> mainThread;
  private Binding<java.util.concurrent.Executor> messagePollThread;
  private Binding<QuoteService> service;

  public Chats$$InjectAdapter() {
    super("com.example.mortar.model.Chats", "members/com.example.mortar.model.Chats", IS_SINGLETON, Chats.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    mainThread = (Binding<rx.Scheduler>) linker.requestBinding("@com.example.mortar.core.MainThread()/rx.Scheduler", Chats.class, getClass().getClassLoader());
    messagePollThread = (Binding<java.util.concurrent.Executor>) linker.requestBinding("java.util.concurrent.Executor", Chats.class, getClass().getClassLoader());
    service = (Binding<QuoteService>) linker.requestBinding("com.example.mortar.model.QuoteService", Chats.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    getBindings.add(mainThread);
    getBindings.add(messagePollThread);
    getBindings.add(service);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<Chats>}.
   */
  @Override
  public Chats get() {
    Chats result = new Chats(mainThread.get(), messagePollThread.get(), service.get());
    return result;
  }
}
