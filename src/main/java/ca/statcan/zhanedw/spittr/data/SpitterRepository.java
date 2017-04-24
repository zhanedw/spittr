package ca.statcan.zhanedw.spittr.data;

import ca.statcan.zhanedw.spittr.Spitter;

/**
 * Interface to retrieve spittles
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
