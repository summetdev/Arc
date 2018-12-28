package io.anuke.arc.util;

/**
 * Interface for disposable resources.
 * @author mzechner
 */
public interface Disposable{
    /** Releases all resources of this object. */
    void dispose();
}