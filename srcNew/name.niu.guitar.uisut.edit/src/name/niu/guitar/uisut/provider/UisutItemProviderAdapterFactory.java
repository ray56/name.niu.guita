/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.provider;

import java.util.ArrayList;
import java.util.Collection;

import name.niu.guitar.uisut.util.UisutAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UisutItemProviderAdapterFactory extends UisutAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UisutItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ITableItemColorProvider.class);
		supportedTypes.add(IItemColorProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UIStatemachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIStatemachineItemProvider uiStatemachineItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UIStatemachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUIStatemachineAdapter() {
		if (uiStatemachineItemProvider == null) {
			uiStatemachineItemProvider = new UIStatemachineItemProvider(this);
		}

		return uiStatemachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.AbstractUIState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractUIStateItemProvider abstractUIStateItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.AbstractUIState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractUIStateAdapter() {
		if (abstractUIStateItemProvider == null) {
			abstractUIStateItemProvider = new AbstractUIStateItemProvider(this);
		}

		return abstractUIStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UITransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UITransitionItemProvider uiTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UITransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUITransitionAdapter() {
		if (uiTransitionItemProvider == null) {
			uiTransitionItemProvider = new UITransitionItemProvider(this);
		}

		return uiTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UISystemVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISystemVariableItemProvider uiSystemVariableItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UISystemVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUISystemVariableAdapter() {
		if (uiSystemVariableItemProvider == null) {
			uiSystemVariableItemProvider = new UISystemVariableItemProvider(this);
		}

		return uiSystemVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UIElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElementItemProvider uiElementItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UIElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUIElementAdapter() {
		if (uiElementItemProvider == null) {
			uiElementItemProvider = new UIElementItemProvider(this);
		}

		return uiElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.CommonState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonStateItemProvider commonStateItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.CommonState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommonStateAdapter() {
		if (commonStateItemProvider == null) {
			commonStateItemProvider = new CommonStateItemProvider(this);
		}

		return commonStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.InitialState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateItemProvider initialStateItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.InitialState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialStateAdapter() {
		if (initialStateItemProvider == null) {
			initialStateItemProvider = new InitialStateItemProvider(this);
		}

		return initialStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.FinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateItemProvider finalStateItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalStateAdapter() {
		if (finalStateItemProvider == null) {
			finalStateItemProvider = new FinalStateItemProvider(this);
		}

		return finalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UISUT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISUTItemProvider uisutItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UISUT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUISUTAdapter() {
		if (uisutItemProvider == null) {
			uisutItemProvider = new UISUTItemProvider(this);
		}

		return uisutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.UISystemVariablePool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISystemVariablePoolItemProvider uiSystemVariablePoolItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.UISystemVariablePool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUISystemVariablePoolAdapter() {
		if (uiSystemVariablePoolItemProvider == null) {
			uiSystemVariablePoolItemProvider = new UISystemVariablePoolItemProvider(this);
		}

		return uiSystemVariablePoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.Stateshortcut} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateshortcutItemProvider stateshortcutItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.Stateshortcut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateshortcutAdapter() {
		if (stateshortcutItemProvider == null) {
			stateshortcutItemProvider = new StateshortcutItemProvider(this);
		}

		return stateshortcutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link name.niu.guitar.uisut.Vertex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexItemProvider vertexItemProvider;

	/**
	 * This creates an adapter for a {@link name.niu.guitar.uisut.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVertexAdapter() {
		if (vertexItemProvider == null) {
			vertexItemProvider = new VertexItemProvider(this);
		}

		return vertexItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (uiStatemachineItemProvider != null) uiStatemachineItemProvider.dispose();
		if (abstractUIStateItemProvider != null) abstractUIStateItemProvider.dispose();
		if (uiTransitionItemProvider != null) uiTransitionItemProvider.dispose();
		if (uiSystemVariableItemProvider != null) uiSystemVariableItemProvider.dispose();
		if (uiElementItemProvider != null) uiElementItemProvider.dispose();
		if (commonStateItemProvider != null) commonStateItemProvider.dispose();
		if (initialStateItemProvider != null) initialStateItemProvider.dispose();
		if (finalStateItemProvider != null) finalStateItemProvider.dispose();
		if (uisutItemProvider != null) uisutItemProvider.dispose();
		if (uiSystemVariablePoolItemProvider != null) uiSystemVariablePoolItemProvider.dispose();
		if (stateshortcutItemProvider != null) stateshortcutItemProvider.dispose();
		if (vertexItemProvider != null) vertexItemProvider.dispose();
	}

}
