package dev.webfx.framework.client.orm.reactive.mapping.entities_to_visual;

import dev.webfx.extras.visual.VisualColumn;
import dev.webfx.framework.client.orm.reactive.mapping.entities_to_grid.EntityColumn;
import dev.webfx.framework.shared.orm.entity.Entity;

/**
 * @author Bruno Salmon
 */
public interface VisualEntityColumn<E extends Entity> extends EntityColumn<E> {

    /**
     * @return the associated visual column.
     */
    VisualColumn getVisualColumn();

}
