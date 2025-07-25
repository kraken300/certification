import React, { useState } from 'react';
import questions from "../../questions.json";

const Quiz = () => {
    const [index, setIndex] = useState(0);
    const [selected, setSelected] = useState(null);
    const [score, setScore] = useState(0);
    const [showScore, setShowScore] = useState(false);

    const handleAnswer = (answer) => {
        setSelected(answer);
    };

    const nextQuestion = () => {
        if (selected === questions[index].correct) {
            setScore(score + 1);
        }
        setSelected(null);
        if (index + 1 < questions.length) {
            setIndex(index + 1);
        } else {
            setShowScore(true);
        }
    };

    const restartQuiz = () => {
        setIndex(0);
        setScore(0);
        setSelected(null);
        setShowScore(false);
    };

    if (showScore) {
        return (
            <div className="quiz-card">
                <h2>Your score: {score} / {questions.length}</h2>
                <button className="restart-btn" onClick={restartQuiz}>
                    Restart Quiz
                </button>
            </div>
        );
    }

    return (
        <div className="quiz-card">
            <h2>{questions[index].question}</h2>
            <div className="answers">
                {questions[index].answers.map((answer, i) => (
                    <button
                        key={i}
                        className={`answer-btn ${selected === answer ? 'selected' : ''}`}
                        onClick={() => handleAnswer(answer)}
                    >
                        {answer}
                    </button>
                ))}
            </div>
            <button
                className="next-btn"
                onClick={nextQuestion}
                disabled={selected === null}
            >
                Next
            </button>
        </div>
    );
};

export default Quiz;